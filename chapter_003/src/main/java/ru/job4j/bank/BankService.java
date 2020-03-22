package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User temp = findByPassport(passport);
        if (temp == null) {
            throw new NullPointerException("Пользователь не найден");
        }
        List<Account> list = users.get(temp);
        if (!list.contains(account)) {
            users.get(temp).add(account);
        } else {
            System.out.println("Данный счёт уже содержится");
        }
    }

    public User findByPassport(String passport) {
        User temp = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                temp = key;
                break;
            }
        }
        return temp;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        Account acc = null;
        List<Account> list = users.get(user);
        for (Account x : list) {
            if (x.getRequisite().equals(requisite)) {
                acc = x;
                break;
            }
        }
        return acc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account newAccount = findByRequisite(destPassport, destRequisite);
        if (account == null && newAccount == null || account.getBalance() < amount) {
            System.out.println("Данный счёт не найден или недостаточно средств для совершения операции");
            return false;
        }
        account.setBalance(account.getBalance() - amount);
        newAccount.setBalance(newAccount.getBalance() + amount);
        return rsl;
    }
}
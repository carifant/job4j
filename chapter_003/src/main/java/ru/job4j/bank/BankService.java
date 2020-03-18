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
        try {
            List<Account> list = users.get(temp);
            if (!list.contains(account)) {
                users.get(temp).add(account);
            } else {
                System.out.println("Данный счёт уже содержится");
            }
        } catch (NullPointerException e) {
            System.out.println("Пользователь не найден");
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
        Account acc = null;
        try {
            List<Account> list = users.get(user);
            for (Account x : list) {
                if (x.getRequisite().equals(requisite)) {
                    acc = x;
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Пользователь не найден");
        }
        return acc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = true;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account newAccount = findByRequisite(destPassport, dеstRequisite);
        if (account == null || newAccount == null) {
            System.out.println("Данный счёт не найден");
            return false;
        }
        if (account.getBalance() < amount) {
            System.out.println("Недостаточно средств для совершения операции");
            return false;
        }
        account.setBalance(account.getBalance() - amount);
        newAccount.setBalance(newAccount.getBalance() + amount);
        return rsl;
    }
}
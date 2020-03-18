package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User temp = findByPassport(passport);
        List<Account> list = users.get(temp);
        if (!list.contains(account)) {
            list.add(account);
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
        List<Account> list = users.get(user);
        Account acc = null;
        for (Account x : list) {
            if (x.getRequisite().equals(requisite)) {
                acc = x;
                break;
            }
        }
        return acc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = true;
        User user = findByPassport(srcPassport);
        User newUser = findByPassport(destPassport);
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
        int index = users.get(user).indexOf(account);
        int index2 = users.get(newUser).indexOf(newAccount);
        users.get(user).get(index).setBalance(account.getBalance() - amount);
        users.get(newUser).get(index2).setBalance(newAccount.getBalance() + amount);

        return rsl;
    }
}
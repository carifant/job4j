package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User x : users) {
            if (x.getUsername().equals(login)) {
                System.out.println("Элемент найден");
                rsl = x;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User не был найден в массиве");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not validate or has too short name ");
        }
        return user.isValid();
    }


    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", false)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException x) {
            x.printStackTrace();
        }

    }
}
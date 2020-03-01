package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = 0;
        for (User x : users) {
            if (x.getUsername().equals(login)) {
                System.out.println("Элемент найден");
                rsl = 1;
            }
            if (rsl == 0) {
                throw new UserNotFoundException("User не был найден в массиве");
            }
        }
        return users[0];
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
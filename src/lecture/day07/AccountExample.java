package lecture.day07;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
//         예금하기
        account.deposit(100000);
        System.out.println("예금액 :" + account.getBalance());
//        출금하기
        try {
            account.withdraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println
                    (message);
        }
    }
}

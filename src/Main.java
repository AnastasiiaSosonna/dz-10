import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account is in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Account has not enough money");
        } catch (Exception e) {
            System.out.println("Error was appeared during processing");
        } finally {
            System.out.println("Thank you for using our service");
        }
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account is in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Account has not enough money");
        } catch (Exception e) {
            System.out.println("Error was appeared during processing");
        } finally {
            System.out.println("Thank you for using our service");
        }
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account is in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Account has not enough money");
        } catch (Exception e) {
            System.out.println("Error was appeared during processing");
        } finally {
            System.out.println("Thank you for using our service");
        }
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account is in another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Account has not enough money");
        } catch (Exception e) {
            System.out.println("Error was appeared during processing");
        } finally {
            System.out.println("Thank you for using our service");
        }


    }
}
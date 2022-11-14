public class Main {
    public static void main(String[] args) {
        String num1="8847208287";
        String num2="7250538227";
        Mobile person1=new Mobile("8847208287");
        Mobile person2=new Mobile("7250538227");

        person1.makeCall(num2);
        person2.incomingCall(num1);





    }
}
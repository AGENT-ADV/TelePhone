public class Mobile implements Phone{
    String myNumber;
    boolean ring;


    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        ring =false;

    }

    @Override
    public boolean isRinging() {
        System.out.println( myNumber + " is ringing");
        return true;
    }

    @Override
    public void answer() {
        System.out.println(myNumber + " Answering the call");

        ring=false;
    }

    @Override
    public void reject() {
        System.out.println("Call Declined!!");
        ring=false;
    }

    @Override
    public void makeCall(String pnumber)
    {

        if(isValid(pnumber))
        {
            System.out.println(myNumber +" is calling "+ pnumber);
        }
        else
            System.out.println("invalid number");
    }

    @Override
    public void incomingCall(String pnumber) {
        ring=isRinging();
        System.out.println(pnumber + " is Calling");
        answer();
        reject();
    }

    @Override
    public boolean isValid(String pnumber) {
        return pnumber.length()==10;
    }
}

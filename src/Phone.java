public interface Phone {

    public boolean isRinging();
    public void answer();
    public void reject();
    public void makeCall(String pnumber);
    public void incomingCall(String pnumber);
    public boolean isValid(String pnumber);

}

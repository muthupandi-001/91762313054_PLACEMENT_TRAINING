public class DefangingAnIP {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangingAnIP s = new DefangingAnIP();
        System.out.println(s.defangIPaddr("255.100.50.0"));
    }
}

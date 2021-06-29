public class NiuAndBinary {
    public String tranBinary (int n) {
        String s = Integer.toBinaryString(n);
        return String.format("%08d",Integer.valueOf(s));
    }
}

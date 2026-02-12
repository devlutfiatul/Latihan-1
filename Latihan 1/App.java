public class App {
    public static void main(String[] args){

        bidangDuaDimensi bj1 = new bujurSangkar("bj1", 10);
        bidangDuaDimensi l1 = new lingkaran("l1", 10);
        bj1.info();
        System.out.println(bj1.luas());
        l1.info();
        System.out.println(l1.luas());
    }
}

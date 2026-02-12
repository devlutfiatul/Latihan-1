class lingkaran extends bidangDuaDimensi{
   public double r;

    public lingkaran (String nama, double r){
        super(nama);
        this.r = r;
    }

    @Override
    public double luas() {
            return 3.14*r*r;
        } 
}

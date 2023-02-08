public enum Season {
    WINTER(-6), SPRING(+27), SUMMER(+16){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },

    AUTUMN(+8);
    private double tem;

    Season(double tem) {
        this.tem = tem;
    }

    public double getTem() {

        return tem;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
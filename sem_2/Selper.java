package sem_2;

public class Selper {
    private String name = "";
    private Integer value = 0;        

        public String getname(){
            return name;
        }

        public Integer getvalue(){
            return value;

        }

        public void Set (String txtIn, Integer intIn){
            this.name = txtIn;
            this.value = intIn;
        }        

        public Selper(){

        }
}

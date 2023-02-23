package com.java.oops;
//another example for Abstraction
    public abstract class Abstract {
        private String names;
        private String city;
        public Abstract(String nm, String cty){
            this.names=nm;
            this.city=cty;
        }
        public abstract void work();
        @Override
        public String toString(){
            return "Names="+this.names+";City="+this.city;
        }
        public void changeName(String newNames) {
            this.names = newNames;
        }
    }
    class ClientMain extends Abstract {
        private int empId;
        public ClientMain(String nm, String cty, int id) {
            super(nm, cty);
            this.empId=id;
        }
        @Override
        public void work() {
            if(empId == 0){
                System.out.println("Invalid name");
            }else{
                System.out.println("Employees List!!");
            }
        }
        public static void main(String[] args){
//coding in terms of abstract classes
            Abstract m1 = new ClientMain("raman","chennai",234);
            m1.work();
//using method implemented in abstract class - inheritance
            m1.changeName("Meera");
            System.out.println(m1);
        }
    }
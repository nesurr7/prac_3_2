package classes;

public class Human {

    String name;
    ///////////
    String[] objsNearHuman = new String[]{"Яблоко","Созревший кокос","Прочную палку","Ничего"};//0-3//len=4
    //////////////
    Human(String name){
        this.name=name;
    }
    public class Arm{
        private int len;
        private String side;
        private boolean armIsBroken;
        Arm(int len,String side,boolean armIsBroken){
            this.len=len;
            this.side=side;
            this.armIsBroken=armIsBroken;
        }
        public void moveArmGrab(){
            if(armIsBroken) {
                System.out.println(name + " попытался двинуть рукой ,\n" +
                        " но у него не получилось ,\n должно быть рука сломана?");
            }
            else if(len>34) {
                System.out.print(name + " попытался дотянутся рукой до куста ," +
                            " и смог достать:"+
                        objsNearHuman[((int)Math.random())%objsNearHuman.length]);
                }
            else System.out.println("Ничего не удалось");
        }
        public void setIsBroken(boolean isBroken){
            this.armIsBroken=isBroken;
        }
    }
    //////////////////
    public class Leg{
        private String side;
        private boolean legIsBroken;
        Leg(String side , boolean legIsBroken){
            this.side=side;
            this.legIsBroken=legIsBroken;
        }

        public void setLegCondition(boolean condition){
            this.legIsBroken=condition;
        }

        public boolean getLegCondition(){
            return this.legIsBroken;
        }

    }
    /////////////////
    public void standOnLegs(Leg legR,Leg legL){
        if (!(legR.getLegCondition() || legL.getLegCondition())) {
            System.out.println(name + " cмог встать на ноги и дойти убежища");
        }
    }
    //////////////////
    public class Head{
        public void shakeHead(){
           System.out.println(name+" потряс головой и пришел в себя");
        }

    }

}

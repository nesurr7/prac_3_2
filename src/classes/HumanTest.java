package classes;

public class HumanTest {
    public static void main(String[] args) {

        Human human = new Human("Генри");
        Human.Leg legR = human.new Leg("R", false);
        Human.Leg legL = human.new Leg("L", false);
        Human.Arm armR = human.new Arm(40, "R", true);
        Human.Arm armL = human.new Arm(39, "L", false);
        Human.Head head = human.new Head();
        ////////////////////
        human.standOnLegs(legR, legL);
        /////////////
        armR.moveArmGrab();
        //////////////
        head.shakeHead();
        ////////////////
        armR.setIsBroken(false);
        //////////
        armR.moveArmGrab();

    }

}

public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it

        hawkeye.takeOff();
        hawkeye.ascend(777);
        hawkeye.ascend(240);
        hawkeye.glide();
        hawkeye.descend(1007);
        /*hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
        */
    }
}

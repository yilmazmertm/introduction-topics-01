public class EncapsulationDriver {
    public static void main(String[] args) {
        EncapsulationPlayer newPlayer = new EncapsulationPlayer();

        newPlayer.setFirstName("Russell");
        newPlayer.setLastName("Westbrook");
        newPlayer.setHeight(191);
        newPlayer.setPointsPerGame(45.8);

        System.out.println("This week's MVP is " +newPlayer.getFirstName() + " " + newPlayer.getLastName() +
        " with avarage points of " + newPlayer.getPointsPerGame());
    }
}

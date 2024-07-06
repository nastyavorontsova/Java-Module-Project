public class Race {
    String winner = "";
    int distance = 0;

    public void winnerAnnouncement(Auto car) {
        int winnersDistance = car.speed * 24;
        if (distance < winnersDistance) {
            winner = car.name;
            distance = winnersDistance;
        }
    }

    public String getWinner() {
        return winner;
    }
}

package task_20_3_1;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        mediaPlayer.setIcon("pause button");
        System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) { }
}

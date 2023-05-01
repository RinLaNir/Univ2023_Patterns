package task_20_3_2;

public class StoppedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        System.out.println("Playing track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {}

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        System.out.println("Switched to next track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        System.out.println("Switched to previous track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {}
}

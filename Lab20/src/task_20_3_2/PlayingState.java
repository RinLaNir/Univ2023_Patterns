package task_20_3_2;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {}

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());
        System.out.println("Paused track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        System.out.println("Playing next track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        System.out.println("Playing previous track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StoppedState());
        System.out.println("Stopped track: " + mediaPlayer.getCurrentTrack());
    }
}

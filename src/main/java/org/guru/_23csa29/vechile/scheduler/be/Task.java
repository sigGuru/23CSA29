package org.guru._23csa29.vechile.scheduler.be;

public class Task {
    private String id;
    private int duration;
    private int score;

    public Task() {
    }

    public Task(String id, int score, int duration) {
        this.id = id;
        this.score = score;
        this.duration = duration;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

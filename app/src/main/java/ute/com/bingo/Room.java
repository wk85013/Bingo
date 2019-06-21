package ute.com.bingo;

public class Room {
    public static final int STATUS_INIT = 0;
    public static final int STATUS_JOINED = 1;
    public static final int STATUS_CREATOR_TURN = 2;
    public static final int STATUS_JOINERS_TURN = 3;
    public static final int STATUS_CREATOR_BINGO = 4;
    public static final int STATUS_JOINERS_BINGO = 5;
    String key;
    String title;
    int status;
    Member creator;
    Member joiner;

    public Room() {
    }

    public Room(String title, Member creator) {
        this.title = title;
        this.creator = creator;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Member getCreator() {
        return creator;
    }

    public void setCreator(Member creator) {
        this.creator = creator;
    }

    public Member getJoiner() {
        return joiner;
    }

    public void setJoiner(Member joiner) {
        this.joiner = joiner;
    }
}

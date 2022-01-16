package com.discordrn.models;

import java.util.List;

public final class Message {
    // attachments
    public String authorId;
    public String avatarURL;
    public String channelId;
    public int colorString;
    public int constrainedWidth;
    public List<MessageContent> content;
    public String edited;
    public int editedColor;
    // embeds
    public int feedbackColor;
    public int flags;
    public boolean gifAutoPlay;
    public int highlightColor;
    public String id;
    // invite
    public boolean isEditing;
    public boolean mentioned;
    // nonce
    // public List<> reactions;
    public String state;
    // stickers
    public String tagText;
    public boolean tagVerified;
    public String timestamp;
    public int timestampColor;
    public int type;
    public String username;
}

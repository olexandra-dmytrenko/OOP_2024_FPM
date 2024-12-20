package lecture14.tdd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Agency {
    List<Channel1> channels = new ArrayList<>();
    public void attach(Channel1 channel1) {
        channels.add(channel1);
    }

    public List<Channel1> getChannels() {
        return channels;
    }
}

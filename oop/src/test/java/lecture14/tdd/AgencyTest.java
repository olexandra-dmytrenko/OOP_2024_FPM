package lecture14.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
    NewsAgency agency = new NewsAgency();
    NewsChannel channel1 = new NewsChannel("CNN");
    NewsChannel channel2 = new NewsChannel("BBC");
    agency.attach(channel1);
    agency.attach(channel2);
    agency.notify("Breaking News!");
 */
public class AgencyTest {
    @Test
    void agencyCanAttach1Channel(){
        //Given
            Channel1 channel1 = new Channel1("CNN");
            Agency agency = new Agency();
        //When
            agency.attach(channel1);
        //Then
            assertEquals(1, agency.getChannels().size());
    }
    @Test
    void agencyCanAttach2Channels(){
        //Given
            Channel1 channel1 = new Channel1("CNN");
            Channel1 channel2 = new Channel1("BBC");
            Agency agency = new Agency();
        //When
            agency.attach(channel1);
            agency.attach(channel2);
        //Then
            assertEquals(2, agency.getChannels().size());
    }

}

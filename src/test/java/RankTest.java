import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {

    @Test
    void getRankValue() {
        Rank rank = Rank.ACE ;
        assertEquals(11,rank.getRankValue());
        assertEquals("ACE",rank.name());
    }
}
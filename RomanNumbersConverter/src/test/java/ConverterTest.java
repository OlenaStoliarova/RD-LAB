import org.junit.Test;
import ua.practice.converter.RomanNumberConverter;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void shouldReturnI(){
        String expected = "I";
        String actual = RomanNumberConverter.toRoman(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnV(){
        String expected = "V";
        String actual = RomanNumberConverter.toRoman(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnX(){
        String expected = "X";
        String actual = RomanNumberConverter.toRoman(10);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnII(){
        String expected = "II";
        String actual = RomanNumberConverter.toRoman(2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIII(){
        String expected = "III";
        String actual = RomanNumberConverter.toRoman(3);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIV(){
        String expected = "IV";
        String actual = RomanNumberConverter.toRoman(4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVI(){
        String expected = "VI";
        String actual = RomanNumberConverter.toRoman(6);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVIII(){
        String expected = "VIII";
        String actual = RomanNumberConverter.toRoman(8);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXII(){
        String expected = "XII";
        String actual = RomanNumberConverter.toRoman(12);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXIV(){
        String expected = "XIV";
        String actual = RomanNumberConverter.toRoman(14);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXVII(){
        String expected = "XVII";
        String actual = RomanNumberConverter.toRoman(17);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXIX(){
        String expected = "XIX";
        String actual = RomanNumberConverter.toRoman(19);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXX(){
        String expected = "XX";
        String actual = RomanNumberConverter.toRoman(20);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXXI(){
        String expected = "XXI";
        String actual = RomanNumberConverter.toRoman(21);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXXIV(){
        String expected = "XXIV";
        String actual = RomanNumberConverter.toRoman(24);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXXVI(){
        String expected = "XXVI";
        String actual = RomanNumberConverter.toRoman(26);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXXIX(){
        String expected = "XXIX";
        String actual = RomanNumberConverter.toRoman(29);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXXX(){
        String expected = "XXX";
        String actual = RomanNumberConverter.toRoman(30);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXXXIII(){
        String expected = "XXXIII";
        String actual = RomanNumberConverter.toRoman(33);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXL(){
        String expected = "XL";
        String actual = RomanNumberConverter.toRoman(40);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXLVI(){
        String expected = "XLVI";
        String actual = RomanNumberConverter.toRoman(46);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnL(){
        String expected = "L";
        String actual = RomanNumberConverter.toRoman(50);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnLXXIV(){
        String expected = "LXXIV";
        String actual = RomanNumberConverter.toRoman(74);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnXCVII(){
        String expected = "XCVII";
        String actual = RomanNumberConverter.toRoman(97);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCIII(){
        String expected = "CIII";
        String actual = RomanNumberConverter.toRoman(103);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCXXXV(){
        String expected = "CXXXV";
        String actual = RomanNumberConverter.toRoman(135);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCCLXXXIV(){
        String expected = "CCLXXXIV";
        String actual = RomanNumberConverter.toRoman(284);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCDLXXVI(){
        String expected = "CDLXXVI";
        String actual = RomanNumberConverter.toRoman(476);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDCCXIX(){
        String expected = "DCCXIX";
        String actual = RomanNumberConverter.toRoman(719);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCMXX(){
        String expected = "CMXX";
        String actual = RomanNumberConverter.toRoman(920);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMMCCCXLVI(){
        String expected = "MMCCCXLVI";
        String actual = RomanNumberConverter.toRoman(2346);
        assertEquals(expected, actual);
    }


    @Test
    public void shouldReturn1(){
        int expected = 1;
        int actual = RomanNumberConverter.toArabic("I");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn34(){
        int expected = 34;
        int actual = RomanNumberConverter.toArabic("XXXIV");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn47(){
        int expected = 47;
        int actual = RomanNumberConverter.toArabic("XLVII");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn55(){
        int expected = 55;
        int actual = RomanNumberConverter.toArabic("LV");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn192(){
        int expected = 192;
        int actual = RomanNumberConverter.toArabic("CXCII");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn3477(){
        int expected = 3477;
        int actual = RomanNumberConverter.toArabic("MMMCDLXXVII");
        assertEquals(expected, actual);
    }
}

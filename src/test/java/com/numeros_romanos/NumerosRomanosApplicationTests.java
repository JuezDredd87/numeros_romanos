package com.numeros_romanos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumerosRomanosApplicationTests {

    private final NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    void contextLoads() {
    }

    @Test
    public void pasar1ARomanos(){
        String romano = numerosRomanos.convertirARomanos(1);

        Assertions.assertEquals("I", romano);
    }

    @Test
    public void pasar2ARomanos(){
        String romano = numerosRomanos.convertirARomanos(2);

        Assertions.assertEquals(romano, "II");
    }

    @Test
    public void pasar3ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3);

        Assertions.assertEquals("III", romano);
    }

    @Test
    public void pasar4ARomanos(){
        String romano = numerosRomanos.convertirARomanos(4);

        Assertions.assertEquals("IV", romano);
    }

    @Test
    public void pasar5ARomanos(){
        String romano = numerosRomanos.convertirARomanos(5);

        Assertions.assertEquals("V", romano);
    }

    @Test
    public void pasar6ARomanos(){
        String romano = numerosRomanos.convertirARomanos(6);

        Assertions.assertEquals("VI", romano);
    }

    @Test
    public void pasar7ARomanos(){
        String romano = numerosRomanos.convertirARomanos(7);

        Assertions.assertEquals("VII", romano);
    }

    @Test
    public void pasar8ARomanos(){
        String romano = numerosRomanos.convertirARomanos(8);

        Assertions.assertEquals("VIII", romano);
    }

    @Test
    public void pasar9ARomanos(){
        String romano = numerosRomanos.convertirARomanos(9);

        Assertions.assertEquals("IX", romano);
    }

    @Test
    public void pasar10ARomanos(){
        String romano = numerosRomanos.convertirARomanos(10);

        Assertions.assertEquals("X", romano);
    }

    @Test
    public void pasar11ARomanos(){
        String romano = numerosRomanos.convertirARomanos(11);

        Assertions.assertEquals( "XI", romano);
    }

    @Test
    public void pasar12ARomanos(){
        String romano = numerosRomanos.convertirARomanos(12);

        Assertions.assertEquals("XII", romano);
    }

    @Test
    public void pasar13ARomanos(){
        String romano = numerosRomanos.convertirARomanos(13);

        Assertions.assertEquals("XIII", romano);
    }

    @Test
    public void pasar14ARomanos(){
        String romano = numerosRomanos.convertirARomanos(14);

        Assertions.assertEquals("XIV", romano);
    }

    @Test
    public void pasar15ARomanos(){
        String romano = numerosRomanos.convertirARomanos(15);

        Assertions.assertEquals("XV", romano);
    }

    @Test
    public void pasar16ARomanos(){
        String romano = numerosRomanos.convertirARomanos(16);

        Assertions.assertEquals("XVI", romano);
    }

    @Test
    public void pasar17ARomanos(){
        String romano = numerosRomanos.convertirARomanos(17);

        Assertions.assertEquals("XVII", romano);
    }

    @Test
    public void pasar18ARomanos(){
        String romano = numerosRomanos.convertirARomanos(18);

        Assertions.assertEquals("XVIII", romano);
    }

    @Test
    public void pasar19ARomanos(){
        String romano = numerosRomanos.convertirARomanos(19);

        Assertions.assertEquals("XIX", romano);
    }

    @Test
    public void pasar20ARomanos(){
        String romano = numerosRomanos.convertirARomanos(20);

        Assertions.assertEquals("XX", romano);
    }

    @Test
    public void pasar21ARomanos(){
        String romano = numerosRomanos.convertirARomanos(21);

        Assertions.assertEquals("XXI", romano);
    }

    @Test
    public void pasar22ARomanos(){
        String romano = numerosRomanos.convertirARomanos(22);

        Assertions.assertEquals("XXII", romano);
    }

    @Test
    public void pasar23ARomanos(){
        String romano = numerosRomanos.convertirARomanos(23);

        Assertions.assertEquals("XXIII", romano);
    }

    @Test
    public void pasar24ARomanos(){
        String romano = numerosRomanos.convertirARomanos(24);

        Assertions.assertEquals("XXIV", romano);
    }

    @Test
    public void pasar25ARomanos(){
        String romano = numerosRomanos.convertirARomanos(25);

        Assertions.assertEquals("XXV", romano);
    }

    @Test
    public void pasar26ARomanos(){
        String romano = numerosRomanos.convertirARomanos(26);

        Assertions.assertEquals("XXVI", romano);
    }

    @Test
    public void pasar27ARomanos(){
        String romano = numerosRomanos.convertirARomanos(27);

        Assertions.assertEquals("XXVII", romano);
    }

    @Test
    public void pasar28ARomanos(){
        String romano = numerosRomanos.convertirARomanos(28);

        Assertions.assertEquals("XXVIII", romano);
    }

    @Test
    public void pasar29ARomanos(){
        String romano = numerosRomanos.convertirARomanos(29);

        Assertions.assertEquals("XXIX", romano);
    }

    @Test
    public void pasar30ARomanos(){
        String romano = numerosRomanos.convertirARomanos(30);

        Assertions.assertEquals("XXX", romano);
    }

    @Test
    public void pasar32ARomanos(){
        String romano = numerosRomanos.convertirARomanos(32);

        Assertions.assertEquals("XXXII", romano);
    }

    @Test
    public void pasar34ARomanos(){
        String romano = numerosRomanos.convertirARomanos(34);

        Assertions.assertEquals("XXXIV", romano);
    }

    @Test
    public void pasar35ARomanos(){
        String romano = numerosRomanos.convertirARomanos(35);

        Assertions.assertEquals("XXXV", romano);
    }

    @Test
    public void pasar40ARomanos(){
        String romano = numerosRomanos.convertirARomanos(40);

        Assertions.assertEquals("XL", romano);
    }

    @Test
    public void pasar44ARomanos(){
        String romano = numerosRomanos.convertirARomanos(44);

        Assertions.assertEquals("XLIV", romano);
    }

    @Test
    public void pasar46ARomanos(){
        String romano = numerosRomanos.convertirARomanos(46);

        Assertions.assertEquals("XLVI", romano);
    }

    @Test
    public void pasar50ARomanos(){
        String romano = numerosRomanos.convertirARomanos(50);

        Assertions.assertEquals("L", romano);
    }

    @Test
    public void pasar55ARomanos(){
        String romano = numerosRomanos.convertirARomanos(55);

        Assertions.assertEquals("LV", romano);
    }

    @Test
    public void pasar59ARomanos(){
        String romano = numerosRomanos.convertirARomanos(59);

        Assertions.assertEquals("LIX", romano);
    }

    @Test
    public void pasar60ARomanos(){
        String romano = numerosRomanos.convertirARomanos(60);

        Assertions.assertEquals("LX", romano);
    }

    @Test
    public void pasar64ARomanos(){
        String romano = numerosRomanos.convertirARomanos(64);

        Assertions.assertEquals("LXIV", romano);
    }

    @Test
    public void pasar65ARomanos(){
        String romano = numerosRomanos.convertirARomanos(65);

        Assertions.assertEquals("LXV", romano);
    }

    @Test
    public void pasar69ARomanos(){
        String romano = numerosRomanos.convertirARomanos(69);

        Assertions.assertEquals("LXIX", romano);
    }

    @Test
    public void pasar70ARomanos(){
        String romano = numerosRomanos.convertirARomanos(70);

        Assertions.assertEquals("LXX", romano);
    }

    @Test
    public void pasar74ARomanos(){
        String romano = numerosRomanos.convertirARomanos(74);

        Assertions.assertEquals("LXXIV", romano);
    }

    @Test
    public void pasar79ARomanos(){
        String romano = numerosRomanos.convertirARomanos(79);

        Assertions.assertEquals("LXXIX", romano);
    }

    @Test
    public void pasar80ARomanos(){
        String romano = numerosRomanos.convertirARomanos(80);

        Assertions.assertEquals("LXXX", romano);
    }

    @Test
    public void pasar90ARomanos(){
        String romano = numerosRomanos.convertirARomanos(90);

        Assertions.assertEquals("XC", romano);
    }

    @Test
    public void pasar100ARomanos(){
        String romano = numerosRomanos.convertirARomanos(100);

        Assertions.assertEquals("C", romano);
    }

    @Test
    public void pasar104ARomanos(){
        String romano = numerosRomanos.convertirARomanos(104);

        Assertions.assertEquals("CIV", romano);
    }

    @Test
    public void pasar109ARomanos(){
        String romano = numerosRomanos.convertirARomanos(109);

        Assertions.assertEquals("CIX", romano);
    }

    @Test
    public void pasar114ARomanos(){
        String romano = numerosRomanos.convertirARomanos(114);

        Assertions.assertEquals("CXIV", romano);
    }

    @Test
    public void pasar119ARomanos(){
        String romano = numerosRomanos.convertirARomanos(119);

        Assertions.assertEquals("CXIX", romano);
    }

    @Test
    public void pasar124ARomanos(){
        String romano = numerosRomanos.convertirARomanos(124);

        Assertions.assertEquals("CXXIV", romano);
    }

    @Test
    public void pasar134ARomanos(){
        String romano = numerosRomanos.convertirARomanos(134);

        Assertions.assertEquals("CXXXIV", romano);
    }

    @Test
    public void pasar144ARomanos(){
        String romano = numerosRomanos.convertirARomanos(144);

        Assertions.assertEquals("CXLIV", romano);
    }

    @Test
    public void pasar154ARomanos(){
        String romano = numerosRomanos.convertirARomanos(154);

        Assertions.assertEquals("CLIV", romano);
    }

    @Test
    public void pasar164ARomanos(){
        String romano = numerosRomanos.convertirARomanos(164);

        Assertions.assertEquals("CLXIV", romano);
    }

    @Test
    public void pasar200ARomanos(){
        String romano = numerosRomanos.convertirARomanos(200);

        Assertions.assertEquals("CC", romano);
    }

    @Test
    public void pasar299ARomanos(){
        String romano = numerosRomanos.convertirARomanos(299);

        Assertions.assertEquals("CCXCIX", romano);
    }

    @Test
    public void pasar300ARomanos(){
        String romano = numerosRomanos.convertirARomanos(300);

        Assertions.assertEquals("CCC", romano);
    }

    @Test
    public void pasar500ARomanos(){
        String romano = numerosRomanos.convertirARomanos(500);

        Assertions.assertEquals("D", romano);
    }

    @Test
    public void pasar539ARomanos(){
        String romano = numerosRomanos.convertirARomanos(539);

        Assertions.assertEquals("DXXXIX", romano);
    }

    @Test
    public void pasar1000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(1000);

        Assertions.assertEquals("M", romano);
    }

    @Test
    public void pasar2000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(2000);

        Assertions.assertEquals("MM", romano);
    }

    @Test
    public void pasar3000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3000);

        Assertions.assertEquals("MMM", romano);
    }

    @Test
    public void pasar3888ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3888);

        Assertions.assertEquals("MMMDCCCLXXXVIII", romano);
    }

    @Test
    public void pasar3889ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3889);

        Assertions.assertEquals("MMMDCCCLXXXIX", romano);
    }

    @Test
    public void pasar3999ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3999);

        Assertions.assertEquals("MMMCMXCIX", romano);
    }

    @Test
    public void pasar4000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(4000);

        Assertions.assertEquals("Numero no soportado", romano);
    }
}

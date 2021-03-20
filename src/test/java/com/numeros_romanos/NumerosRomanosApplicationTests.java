package com.numeros_romanos;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class NumerosRomanosApplicationTests {

    private final NumerosRomanos numerosRomanos = new NumerosRomanos();
    // mock creation
    List mockedList = mock(List.class);
    NumerosRomanos mockedNumerosRomanos = mock(NumerosRomanos.class);


    @Test
    void mockList(){
        // using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");
        mockedList.clear();

        // selective, explicit, highly readable verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    void mockNumerosRomanos(){
        verify(mockedNumerosRomanos);
    }

    @Test
    void setMockedNumerosRomanos1(){
        when(mockedNumerosRomanos.convertirARomanos(1)).thenReturn("I");
    }

    @Test
    void contextLoads() {
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10})
    void parameterizedTest(int numero){
        System.out.println(numero + " en números romanos es " + numerosRomanos.convertirARomanos(numero));
    }

    @Test
    public void pasar1ARomanos(){
        String romano = numerosRomanos.convertirARomanos(1);

        assertEquals("I", romano);
    }

    @TestFactory
    public List<DynamicTest> dynamicTestsFromList() {
        return Arrays.asList(
                DynamicTest.dynamicTest("1st dynamic test", () -> assertEquals("I", numerosRomanos.convertirARomanos(1))),
                DynamicTest.dynamicTest("2nd dynamic test", () -> assertEquals("II", numerosRomanos.convertirARomanos(2))),
                DynamicTest.dynamicTest("3rd dynamic test", () -> assertEquals("III", numerosRomanos.convertirARomanos(3)))
        );
    }

    @Test
    public void verificarVeintenaNumeroRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29);

        List<String> romanos = numerosNaturales.stream()
                .map(numerosRomanos::convertirARomanos)
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XX");
        assertEquals(romanos.get(1), "XXI");
        assertEquals(romanos.get(2), "XXII");
        assertEquals(romanos.get(3), "XXIII");
        assertEquals(romanos.get(4), "XXIV");
        assertEquals(romanos.get(5), "XXV");
        assertEquals(romanos.get(6), "XXVI");
        assertEquals(romanos.get(7), "XXVII");
        assertEquals(romanos.get(8), "XXVIII");
        assertEquals(romanos.get(9), "XXIX");

    }

    @Test
    public void verificarTreintenaNumeroRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38, 39);

        List<String> romanos = numerosNaturales.stream()
                .map(numerosRomanos::convertirARomanos)
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XXX");
        assertEquals(romanos.get(1), "XXXI");
        assertEquals(romanos.get(2), "XXXII");
        assertEquals(romanos.get(3), "XXXIII");
        assertEquals(romanos.get(4), "XXXIV");
        assertEquals(romanos.get(5), "XXXV");
        assertEquals(romanos.get(6), "XXXVI");
        assertEquals(romanos.get(7), "XXXVII");
        assertEquals(romanos.get(8), "XXXVIII");
        assertEquals(romanos.get(9), "XXXIX");

    }

    @Test
    public void verificarDecimalesRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(40, 50, 60, 70, 80, 90, 88, 67);

        List<String> romanos = numerosNaturales.stream()
                .map(numerosRomanos::convertirARomanos)
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XL");
        assertEquals(romanos.get(1), "L");
        assertEquals(romanos.get(2), "LX");
        assertEquals(romanos.get(3), "LXX");
        assertEquals(romanos.get(4), "LXXX");
        assertEquals(romanos.get(5), "XC");
        assertEquals(romanos.get(6), "LXXXVIII");
        assertEquals(romanos.get(7), "LXVII");

    }

    @Test
    public void verificarRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 3234);

        List<String> romanos = numerosNaturales.stream()
                .map(numerosRomanos::convertirARomanos)
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "C");
        assertEquals(romanos.get(1), "CC");
        assertEquals(romanos.get(2), "CCC");
        assertEquals(romanos.get(3), "CD");
        assertEquals(romanos.get(4), "D");
        assertEquals(romanos.get(5), "DC");
        assertEquals(romanos.get(6), "DCC");
        assertEquals(romanos.get(7), "DCCC");
        assertEquals(romanos.get(8), "CM");
        assertEquals(romanos.get(9), "MMMCCXXXIV");

    }

    @Test
    public void pasar2ARomanos(){
        String romano = numerosRomanos.convertirARomanos(2);

        assertEquals(romano, "II");
    }

    @Test
    public void pasar3ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3);

        assertEquals("III", romano);
    }

    @Test
    public void pasar4ARomanos(){
        String romano = numerosRomanos.convertirARomanos(4);

        assertEquals("IV", romano);
    }

    @Test
    public void pasar5ARomanos(){
        String romano = numerosRomanos.convertirARomanos(5);

        assertEquals("V", romano);
    }

    @Test
    public void pasar6ARomanos(){
        String romano = numerosRomanos.convertirARomanos(6);

        assertEquals("VI", romano);
    }

    @Test
    public void pasar7ARomanos(){
        String romano = numerosRomanos.convertirARomanos(7);

        assertEquals("VII", romano);
    }

    @Test
    public void pasar8ARomanos(){
        String romano = numerosRomanos.convertirARomanos(8);

        assertEquals("VIII", romano);
    }

    @Test
    public void pasar9ARomanos(){
        String romano = numerosRomanos.convertirARomanos(9);

        assertEquals("IX", romano);
    }

    @Test
    public void pasar10ARomanos(){
        String romano = numerosRomanos.convertirARomanos(10);

        assertEquals("X", romano);
    }

    @Test
    public void pasar11ARomanos(){
        String romano = numerosRomanos.convertirARomanos(11);

        assertEquals( "XI", romano);
    }

    @Test
    public void pasar12ARomanos(){
        String romano = numerosRomanos.convertirARomanos(12);

        assertEquals("XII", romano);
    }

    @Test
    public void pasar13ARomanos(){
        String romano = numerosRomanos.convertirARomanos(13);

        assertEquals("XIII", romano);
    }

    @Test
    public void pasar14ARomanos(){
        String romano = numerosRomanos.convertirARomanos(14);

        assertEquals("XIV", romano);
    }

    @Test
    public void pasar15ARomanos(){
        String romano = numerosRomanos.convertirARomanos(15);

        assertEquals("XV", romano);
    }

    @Test
    public void pasar16ARomanos(){
        String romano = numerosRomanos.convertirARomanos(16);

        assertEquals("XVI", romano);
    }

    @Test
    public void pasar17ARomanos(){
        String romano = numerosRomanos.convertirARomanos(17);

        assertEquals("XVII", romano);
    }

    @Test
    public void pasar18ARomanos(){
        String romano = numerosRomanos.convertirARomanos(18);

        assertEquals("XVIII", romano);
    }

    @Test
    public void pasar19ARomanos(){
        String romano = numerosRomanos.convertirARomanos(19);

        assertEquals("XIX", romano);
    }

    @Test
    public void pasar20ARomanos(){
        String romano = numerosRomanos.convertirARomanos(20);

        assertEquals("XX", romano);
    }

    @Test
    public void pasar21ARomanos(){
        String romano = numerosRomanos.convertirARomanos(21);

        assertEquals("XXI", romano);
    }

    @Test
    public void pasar22ARomanos(){
        String romano = numerosRomanos.convertirARomanos(22);

        assertEquals("XXII", romano);
    }

    @Test
    public void pasar23ARomanos(){
        String romano = numerosRomanos.convertirARomanos(23);

        assertEquals("XXIII", romano);
    }

    @Test
    public void pasar24ARomanos(){
        String romano = numerosRomanos.convertirARomanos(24);

        assertEquals("XXIV", romano);
    }

    @Test
    public void pasar25ARomanos(){
        String romano = numerosRomanos.convertirARomanos(25);

        assertEquals("XXV", romano);
    }

    @Test
    public void pasar26ARomanos(){
        String romano = numerosRomanos.convertirARomanos(26);

        assertEquals("XXVI", romano);
    }

    @Test
    public void pasar27ARomanos(){
        String romano = numerosRomanos.convertirARomanos(27);

        assertEquals("XXVII", romano);
    }

    @Test
    public void pasar28ARomanos(){
        String romano = numerosRomanos.convertirARomanos(28);

        assertEquals("XXVIII", romano);
    }

    @Test
    public void pasar29ARomanos(){
        String romano = numerosRomanos.convertirARomanos(29);

        assertEquals("XXIX", romano);
    }

    @Test
    public void pasar30ARomanos(){
        String romano = numerosRomanos.convertirARomanos(30);

        assertEquals("XXX", romano);
    }

    @Test
    public void pasar32ARomanos(){
        String romano = numerosRomanos.convertirARomanos(32);

        assertEquals("XXXII", romano);
    }

    @Test
    public void pasar34ARomanos(){
        String romano = numerosRomanos.convertirARomanos(34);

        assertEquals("XXXIV", romano);
    }

    @Test
    public void pasar35ARomanos(){
        String romano = numerosRomanos.convertirARomanos(35);

        assertEquals("XXXV", romano);
    }

    @Test
    public void pasar40ARomanos(){
        String romano = numerosRomanos.convertirARomanos(40);

        assertEquals("XL", romano);
    }

    @Test
    public void pasar44ARomanos(){
        String romano = numerosRomanos.convertirARomanos(44);

        assertEquals("XLIV", romano);
    }

    @Test
    public void pasar46ARomanos(){
        String romano = numerosRomanos.convertirARomanos(46);

        assertEquals("XLVI", romano);
    }

    @Test
    public void pasar50ARomanos(){
        String romano = numerosRomanos.convertirARomanos(50);

        assertEquals("L", romano);
    }

    @Test
    public void pasar55ARomanos(){
        String romano = numerosRomanos.convertirARomanos(55);

        assertEquals("LV", romano);
    }

    @Test
    public void pasar59ARomanos(){
        String romano = numerosRomanos.convertirARomanos(59);

        assertEquals("LIX", romano);
    }

    @Test
    public void pasar60ARomanos(){
        String romano = numerosRomanos.convertirARomanos(60);

        assertEquals("LX", romano);
    }

    @Test
    public void pasar64ARomanos(){
        String romano = numerosRomanos.convertirARomanos(64);

        assertEquals("LXIV", romano);
    }

    @Test
    public void pasar65ARomanos(){
        String romano = numerosRomanos.convertirARomanos(65);

        assertEquals("LXV", romano);
    }

    @Test
    public void pasar69ARomanos(){
        String romano = numerosRomanos.convertirARomanos(69);

        assertEquals("LXIX", romano);
    }

    @Test
    public void pasar70ARomanos(){
        String romano = numerosRomanos.convertirARomanos(70);

        assertEquals("LXX", romano);
    }

    @Test
    public void pasar74ARomanos(){
        String romano = numerosRomanos.convertirARomanos(74);

        assertEquals("LXXIV", romano);
    }

    @Test
    public void pasar79ARomanos(){
        String romano = numerosRomanos.convertirARomanos(79);

        assertEquals("LXXIX", romano);
    }

    @Test
    public void pasar80ARomanos(){
        String romano = numerosRomanos.convertirARomanos(80);

        assertEquals("LXXX", romano);
    }

    @Test
    public void pasar90ARomanos(){
        String romano = numerosRomanos.convertirARomanos(90);

        assertEquals("XC", romano);
    }

    @Test
    public void pasar100ARomanos(){
        String romano = numerosRomanos.convertirARomanos(100);

        assertEquals("C", romano);
    }

    @Test
    public void pasar104ARomanos(){
        String romano = numerosRomanos.convertirARomanos(104);

        assertEquals("CIV", romano);
    }

    @Test
    public void pasar109ARomanos(){
        String romano = numerosRomanos.convertirARomanos(109);

        assertEquals("CIX", romano);
    }

    @Test
    public void pasar114ARomanos(){
        String romano = numerosRomanos.convertirARomanos(114);

        assertEquals("CXIV", romano);
    }

    @Test
    public void pasar119ARomanos(){
        String romano = numerosRomanos.convertirARomanos(119);

        assertEquals("CXIX", romano);
    }

    @Test
    public void pasar124ARomanos(){
        String romano = numerosRomanos.convertirARomanos(124);

        assertEquals("CXXIV", romano);
    }

    @Test
    public void pasar134ARomanos(){
        String romano = numerosRomanos.convertirARomanos(134);

        assertEquals("CXXXIV", romano);
    }

    @Test
    public void pasar144ARomanos(){
        String romano = numerosRomanos.convertirARomanos(144);

        assertEquals("CXLIV", romano);
    }

    @Test
    public void pasar154ARomanos(){
        String romano = numerosRomanos.convertirARomanos(154);

        assertEquals("CLIV", romano);
    }

    @Test
    public void pasar164ARomanos(){
        String romano = numerosRomanos.convertirARomanos(164);

        assertEquals("CLXIV", romano);
    }

    @Test
    public void pasar200ARomanos(){
        String romano = numerosRomanos.convertirARomanos(200);

        assertEquals("CC", romano);
    }

    @Test
    public void pasar299ARomanos(){
        String romano = numerosRomanos.convertirARomanos(299);

        assertEquals("CCXCIX", romano);
    }

    @Test
    public void pasar300ARomanos(){
        String romano = numerosRomanos.convertirARomanos(300);

        assertEquals("CCC", romano);
    }

    @Test
    public void pasar500ARomanos(){
        String romano = numerosRomanos.convertirARomanos(500);

        assertEquals("D", romano);
    }

    @Test
    public void pasar539ARomanos(){
        String romano = numerosRomanos.convertirARomanos(539);

        assertEquals("DXXXIX", romano);
    }

    @Test
    public void pasar1000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(1000);

        assertEquals("M", romano);
    }

    @Test
    public void pasar2000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(2000);

        assertEquals("MM", romano);
    }

    @Test
    public void pasar3000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3000);

        assertEquals("MMM", romano);
    }

    @Test
    public void pasar3888ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3888);

        assertEquals("MMMDCCCLXXXVIII", romano);
    }

    @Test
    public void pasar3889ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3889);

        assertEquals("MMMDCCCLXXXIX", romano);
    }

    @Test
    public void pasar3999ARomanos(){
        String romano = numerosRomanos.convertirARomanos(3999);

        assertEquals("MMMCMXCIX", romano);
    }

    @Test
    public void pasar4000ARomanos(){
        String romano = numerosRomanos.convertirARomanos(4000);

        assertEquals("Numero no soportado", romano);
    }
}

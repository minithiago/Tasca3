import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificarContrasenyaTest {

    @org.junit.jupiter.api.Test
    void verificar6() {
        assertEquals(false,VerificarContrasenya.verificar(""));
        System.out.println();

    }
    @Test
    void verificar7(){
        assertEquals(false,VerificarContrasenya.verificar("hola"));
        System.out.println();
    }
    @Test
    void verificar8(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracola"));
        System.out.println();
    }
    @Test
    void verificar9(){
        assertEquals(false,VerificarContrasenya.verificar("hola12"));
        System.out.println();
    }
    @Test
    void verificar10(){
        assertEquals(false,VerificarContrasenya.verificar("holA"));
        System.out.println();
    }
    @Test
    void verificar11(){
        assertEquals(false,VerificarContrasenya.verificar("hola!"));
        System.out.println();
    }
    @Test
    void verificar12(){
        assertEquals(false,VerificarContrasenya.verificar("holaA!"));
        System.out.println();
    }
    @Test
    void verificar13(){
        assertEquals(false,VerificarContrasenya.verificar("hola12!"));
        System.out.println();
    }
    @Test
    void verificar14(){
        assertEquals(false,VerificarContrasenya.verificar("hola12A"));
        System.out.println();
    }
    @Test
    void verificar15(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracola12"));
        System.out.println();
    }
    @Test
    void verificar16(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracola!"));
        System.out.println();
    }
    @Test
    void verificar17(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracolA"));
        System.out.println();
    }
    @Test
    void verificar18(){
        assertEquals(false,VerificarContrasenya.verificar("ho12A"));
        System.out.println();
    }
    @Test
    void verificar19(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracolaA!"));
        System.out.println();
    }
    @Test
    void verificar20(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracola12!"));
        System.out.println();
    }
    @Test
    void verificar21(){
        assertEquals(false,VerificarContrasenya.verificar("holacaracola12A"));
        System.out.println();
    }
    @Test
    void verificar22(){
        assertEquals(true,VerificarContrasenya.verificar("holacaracola12A!"));
        System.out.println();
    }
    @Test
    void verificar23(){
        assertEquals(true,VerificarContrasenya.verificar("#P4blit0cl4v0uncl4vit0#"));
        System.out.println();
    }
}
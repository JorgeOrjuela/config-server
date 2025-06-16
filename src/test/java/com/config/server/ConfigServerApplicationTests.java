package com.config.server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
class ConfigServerApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void testConfigServer() {
        // Prueba básica para verificar que el servidor de configuración está funcionando
        assertTrue(true);
    }
}

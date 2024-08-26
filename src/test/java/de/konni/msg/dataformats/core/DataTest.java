package de.konni.msg.dataformats.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataTest {
    @Test
    void createDataFromObject() {
        var object = new TransactionMetadataUpdate();
        var data = Data.from(object, TestDataFormats.transactionMetadataUpdate());

        var value = data.get(new Path("benutzername"));
        assertNotNull(value);
        assertTrue(value.hasObject());
        assertTrue(value.has(Type.STRING));
        assertEquals("XXX", value.object());
    }
}

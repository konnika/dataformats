package de.konni.msg.dataformats.core;

import de.msg4banking.processservice.application.model.transaction.KopfdatenUpdateRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataTest {
    @Test
    void createDataFromObject() {
        var object = new KopfdatenUpdateRequest();
        var data = Data.from(object, TestDataFormats.transactionMetadataUpdate());

        var value = data.get(new Path("benutzername"));
        assertNotNull(value);
        assertTrue(value.hasObject());
        assertTrue(value.has(Type.STRING));
        assertEquals("XXX", value.object());
    }
}

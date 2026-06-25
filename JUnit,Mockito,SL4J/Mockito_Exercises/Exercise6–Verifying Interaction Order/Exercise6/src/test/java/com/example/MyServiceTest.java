package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {

        ExternalApi mockApi =
                mock(ExternalApi.class);

        MyService service =
                new MyService(mockApi);

        service.performOperation();

        InOrder inOrder =
                inOrder(mockApi);

        inOrder.verify(mockApi)
               .connect();

        inOrder.verify(mockApi)
               .fetchData();

        inOrder.verify(mockApi)
               .disconnect();
    }
}
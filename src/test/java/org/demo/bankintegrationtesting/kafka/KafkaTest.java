package org.demo.bankintegrationtesting.kafka;

import org.springframework.beans.factory.annotation.Autowired;

public class KafkaTest {
//    private static String BOOT_TOPIC = "boot.t";
//
//    @Autowired
//    private Sender sender;
//
//    @Autowired
//    private Receiver receiver;
//
//    @ClassRule
//    public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BOOT_TOPIC);
//
//    @BeforeClass
//    public static void setUpBeforeClass() throws Exception {
//        System.setProperty("spring.kafka.bootstrap-servers", embeddedKafka.getBrokersAsString());
//    }
//
//    @Test
//    public void testReceive() throws Exception {
//        sender.send(BOOT_TOPIC, "Hello Boot!");
//
//        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
//        assertThat(receiver.getLatch().getCount()).isEqualTo(0);
//    }
}

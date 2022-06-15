public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
            }
        if (transport instanceof CheckEngineable) {
            ((CheckEngineable) transport).checkEngine();
        }
        if (transport instanceof CheckTrailerable) {
            ((CheckTrailerable) transport).checkTrailer();
        }

    }
}
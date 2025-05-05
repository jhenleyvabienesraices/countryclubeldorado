import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConversionsApiExample {

  public static final String ACCESS_TOKEN = "<EAARmmf6Re2ABO93UeADBmDouK43kNgRZCZAMqOqZCn2aR7ZBOZAxWI7nMsbrcHTUuhAMnyLUu2EsVQ7xVpHyajuZAuKS9kTcqra7Ve2ePjKpSPzYpavAQixlkkKb3Vurcr8oUT8jcGTH7YwOCHonXc1sAvo2uLMZCfzh4Ovss22z6IMcCDVEgs43M94YmXT0KG1rAZDZD>";
  public static final String PIXEL_ID = "<829054912441127>";

  public static void main(String[] args) {
    APIContext context = new APIContext(ACCESS_TOKEN).enableDebug(true);
    context.setLogger(System.out);
    List<Event> events = new ArrayList<>();

    UserData userData_0 = new UserData()
      .emails(Arrays.asList("7b17fb0bd173f625b58636fb796407c22b3d16fc78302d79f0fd30c2fc2fc068"))
      .phones(Arrays.asList());

    CustomData customData_0 = new CustomData()
      .value(142.52f)
      .currency("USD");

    Event event_0 = new Event()
      .eventName("Purchase")
      .eventTime(1746485895L)
      .userData(userData_0)
      .customData(customData_0)
      .actionSource("website");
    events.add(event_0);

    EventRequest eventRequest = new EventRequest(PIXEL_ID, context)
      .data(events);

    try {
      EventResponse response = eventRequest.execute();
      System.out.printf("Standard API response : %s ", response);
    } catch (APIException e) {
      e.printStackTrace();
    }
  }
}

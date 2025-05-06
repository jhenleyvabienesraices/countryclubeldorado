import com.facebook.ads.sdk.APIContext;
import com.facebook.ads.sdk.APIException;
import com.facebook.ads.sdk.serverside.Content;
import com.facebook.ads.sdk.serverside.CustomData;
import com.facebook.ads.sdk.serverside.Event;
import com.facebook.ads.sdk.serverside.EventRequest;
import com.facebook.ads.sdk.serverside.EventResponse;
import com.facebook.ads.sdk.serverside.UserData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConversionsApiExample {

  public static final String ACCESS_TOKEN = "<EAARmmf6Re2ABOwtZBokgEitTGNm5bv2zub0qkGTbNlln3lis0ItwL8DAYtixfe3GPRHMDLeQR6vRUcO1EwrZBmsZCwJeo9MJBwqODZB4f3EiC1NkyPbMIIW77ot58M811lTTWwGoZCQqkEwoYEqn32ZBZC01RufUuYuS6VSZCgI385ftkszpHmJba4T3i0JbUaEdNQZDZD>";
  public static final String PIXEL_ID = "<829054912441127>";

  public static void main(String[] args) {
    APIContext context = new APIContext(EAARmmf6Re2ABOwtZBokgEitTGNm5bv2zub0qkGTbNlln3lis0ItwL8DAYtixfe3GPRHMDLeQR6vRUcO1EwrZBmsZCwJeo9MJBwqODZB4f3EiC1NkyPbMIIW77ot58M811lTTWwGoZCQqkEwoYEqn32ZBZC01RufUuYuS6VSZCgI385ftkszpHmJba4T3i0JbUaEdNQZDZD).enableDebug(true);
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
      .actionSource(ActionSource.website);
    events.add(event_0);

    EventRequest eventRequest = new EventRequest(829054912441127, context)
      .data(events);

    try {
      EventResponse response = eventRequest.execute();
      System.out.printf("Standard API response : %s ", response);
    } catch (APIException e) {
      e.printStackTrace();
    }
  }
}



import java.io.IOException;

import org.entur.netex.NetexParser;
import org.entur.netex.index.api.NetexEntitiesIndex;

public class Main {

  private static NetexEntitiesIndex index;

  public static void main(final String[] args) {

    final NetexParser parser=new NetexParser();
    try {
      //be careful the path starts from src/main/resource if copy+paste the path
      index=parser.parse("src/main/resources/NeTEx_CXX_ZLD_20240718_2024-07-21_202400310_baseline.zip");

      System.out.print(index.getTimetableFrames());
      System.out.print("haha");
    } catch (final IOException e) {
      e.printStackTrace();
    }


  }

}

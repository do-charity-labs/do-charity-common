package labs.docharity.common.mutation;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import labs.docharity.common.schema.types.Show;

@DgsComponent
public class ShowMutation {

    @DgsMutation
    public Show createShow(String title, int releaseYear) {
        return new Show(title, releaseYear);
    }

}

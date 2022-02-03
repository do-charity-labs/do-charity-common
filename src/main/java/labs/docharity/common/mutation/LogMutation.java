package labs.docharity.common.mutation;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
public class LogMutation {

    @DgsMutation
    public Boolean logInfo(String s) {
        log.info("{}", s);
        return Boolean.TRUE;
    }

}

package racingcar.dao;

import racingcar.domain.Car;

import java.util.List;

public interface RacingCarDao {
    long saveWinners(final int count, final String winners);

    void saveCars(final Number resultId, final List<Car> cars);
}
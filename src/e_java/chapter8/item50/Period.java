package e_java.chapter8.item50;

import java.util.Date;

/**
 * FileName: Period
 * Date: 2020/10/14 14:51
 * Author:cs
 * Description:
 */
public class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }
}

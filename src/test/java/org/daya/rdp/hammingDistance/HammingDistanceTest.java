package org.daya.rdp.hammingDistance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

public class HammingDistanceTest {

    HammingDistance testObject = new HammingDistance();

    @Test
    public void computeClosestDistance_whenEqual() {
        int toVerify = testObject.computeClosestDistance("ONE", "ONE");
        assertThat(toVerify, equalTo(0));
    }

    @Test
    public void computeClosestDistance_case1() {
        List<String> list = new ArrayList<>();

        list.add("CTCCATCACAC");
        list.add("AATATCTACAT");
        list.add("ACATTCTCCAT");
        list.add("CCTCCCCACTC");

        List<Integer> toVerify = testObject.computeClosestDistance(list);
        assertThat(toVerify, hasItems(5, 4, 8, 11));
    }

    @Test
    public void computeClosestDistance_case2() {
        List<String> list = new ArrayList<>();

        list.add("AACACCCTATA");
        list.add("CTTCATCCACA");
        list.add("TTTCAATTTTC");
        list.add("ACAATCAAACC");
        list.add("ATTCTACAACT");
        list.add("ATTCCTTATTC");
        list.add("ACTTCTCTATT");
        list.add("TAAAACTCACC");
        list.add("CTTTTCCCACC");
        list.add("ACCTTTTCTCA");
        list.add("TACCACTACTT");

        List<Integer> toVerify = testObject.computeClosestDistance(list);
        assertThat(toVerify, hasItems(5, 4, 4, 5, 5, 6, 7, 6, 7, 9, 11));
    }
}
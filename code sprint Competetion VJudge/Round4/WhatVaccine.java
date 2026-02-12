import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhatVaccine {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());

            while (t-- > 0) {
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken()); // patients
                int k = Integer.parseInt(st.nextToken()); // doses per pack
                int d = Integer.parseInt(st.nextToken()); // pack lifetime
                int w = Integer.parseInt(st.nextToken()); // max patient wait

                long[] arrivalTimes = new long[n];
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    arrivalTimes[i] = Long.parseLong(st.nextToken());
                }

                System.out.println(packCounter(k, d, w, arrivalTimes));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static int packCounter(int doeasPerVacc, int lifetimeOfVacc, int waitOfPatient, long[] arrivalTime) {

        int totalPacks = 0;

        int expiryOfVacc = 0;
        int doesRemaining = 0;

        for (long i : arrivalTime) {
            if ((i <= expiryOfVacc) && (doesRemaining > 0)) {
                doesRemaining -= 1;
            } else {
                totalPacks += 1;

                int openingTime = (int) i + waitOfPatient;

                expiryOfVacc = openingTime + lifetimeOfVacc;

                doesRemaining = doeasPerVacc - 1;
            }
        }

        return totalPacks;
    }
}

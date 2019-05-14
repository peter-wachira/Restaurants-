//package com.epicodus.com;
//
//import android.view.View;
//
//import org.junit.Rule;
//import org.junit.Test;
//import static androidx.test.espresso.Espresso.onData;
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
//import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static org.hamcrest.CoreMatchers.anything;
//import static org.hamcrest.core.IsNot.not;
//
//public class RestaurantsActivityInstrumentationTest {
//
//    @Rule
//    public ActivityTestRule<RestaurantsActivity> activityTestRule =
//            new ActivityTestRule<>(RestaurantsActivity.class);
//
//    @Test
//    public void listItemClickDisplaysToastWithCorrectRestaurant() {
//        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
//        String restaurantName = "Mi Mero Mole";
//        onData(anything())
//                .inAdapterView(withId(R.id.listView))
//                .atPosition(0)
//                .perform(click());
//        onView(withText(restaurantName)).inRoot(withDecorView(not(activityDecorView)))
//                .check(matches(withText(restaurantName)));
//    }
//}
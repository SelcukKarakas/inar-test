package week_16_assignments.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import week_16_assignments.main.SubscriptionManager;
public class TestSubscription2 {





        @Test
        void testConfigureSubscription() {
            SubscriptionManager subscriptionManager = new SubscriptionManager();

            // Test case 1: FREE tier, EMAIL notification, ENABLED auto-renewal
            String result1 = subscriptionManager.configureSubscription(
                    SubscriptionManager.SubscriptionTier.FREE,
                    SubscriptionManager.NotificationPreference.EMAIL,
                    SubscriptionManager.AutoRenewal.ENABLED
            );
            assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED", result1);

            // Test case 2: PREMIUM tier, SMS notification, DISABLED auto-renewal
            String result2 = subscriptionManager.configureSubscription(
                    SubscriptionManager.SubscriptionTier.PREMIUM,
                    SubscriptionManager.NotificationPreference.SMS,
                    SubscriptionManager.AutoRenewal.DISABLED
            );
            assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED", result2);

            // Test case 3: STANDARD tier, NONE notification, ENABLED auto-renewal
            String result3 = subscriptionManager.configureSubscription(
                    SubscriptionManager.SubscriptionTier.STANDARD,
                    SubscriptionManager.NotificationPreference.NONE,
                    SubscriptionManager.AutoRenewal.ENABLED
            );
            assertEquals("Subscription Configured: Tier=STANDARD, Notification=NONE, AutoRenewal=ENABLED", result3);
        }
    }



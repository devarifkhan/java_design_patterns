# Iterator Pattern

## 🎯 সমস্যা

ধরা যাক, আপনি একটি ই-কমার্স সাইটে কাজ করছেন যেখানে অনেক ধরনের প্রোডাক্ট রয়েছে। প্রতিটি প্রোডাক্ট একটি **কালেকশনে** (যেমন: লিস্ট, অ্যারে, বা ডেটাবেজ) রয়েছে। আপনি চান যে ব্যবহারকারীরা সহজেই প্রোডাক্টগুলোর মধ্য দিয়ে নেভিগেট করতে পারে, একে একে প্রোডাক্ট দেখতে পারবে। কিন্তু প্রশ্ন হচ্ছে, **"কীভাবে আমি কালেকশনের অভ্যন্তরীণ স্ট্রাকচার প্রকাশ না করে প্রোডাক্টগুলোর মধ্যে নেভিগেট করাবো?"**

## 💡 সমাধান

এই সমস্যার সমাধান হলো **Iterator Pattern**। Iterator Pattern এমন একটি ডিজাইন প্যাটার্ন, যা কোনো কালেকশন অবজেক্টের উপাদানগুলোর মধ্য দিয়ে একে একে যেতে দেয়, কিন্তু এর অভ্যন্তরীণ ডিটেইলস প্রকাশ না করেই। এতে করে আপনি সহজে প্রতিটি উপাদান দেখতে পারবেন, ঠিক যেমন **মিউজিক প্লেয়ারে গান স্ক্রল** করেন। 🎵

### 🛠 বাস্তব উদাহরণ:

ধরুন, আপনি একটি ই-কমার্স সাইটে বিভিন্ন প্রোডাক্ট নিয়ে কাজ করছেন। এখন প্রোডাক্টগুলো একটি **কালেকশন** বা **লিস্ট** হিসেবে সেভ করা আছে। Iterator Pattern ব্যবহারের মাধ্যমে আপনি এই প্রোডাক্টগুলোর মধ্য দিয়ে একে একে যেতে পারবেন, যেমন:

# Flyweight Pattern

## সমস্যা
ধরা যাক, আপনি একটি ভিডিও গেম তৈরি করছেন, যেখানে অনেকগুলো গাছ এবং বিভিন্ন ধরনের চরিত্র রয়েছে। যদি প্রতিটি গাছ বা চরিত্রের জন্য আলাদাভাবে একটি নতুন অবজেক্ট তৈরি করেন, তাহলে আপনার মেমরি দ্রুত শেষ হয়ে যাবে। এতে পারফরম্যান্সের সমস্যা হবে এবং গেমের দ্রুতগতিও কমে যাবে।

এখন প্রশ্ন হলো, **"আমি কীভাবে একই ধরনের গাছ বা চরিত্রের জন্য কম মেমরি ব্যবহার করতে পারি?"**

## সমাধান
এই সমস্যার সমাধান হলো **ফ্লাইওয়েট প্যাটার্ন**। ফ্লাইওয়েট প্যাটার্নের মাধ্যমে আপনি অবজেক্টগুলোর মধ্যে সাধারণ অংশগুলো শেয়ার করতে পারবেন এবং শুধুমাত্র তাদের ভিন্ন ভিন্ন বৈশিষ্ট্যগুলো আলাদাভাবে সংরক্ষণ করবেন।

### কিভাবে ফ্লাইওয়েট প্যাটার্ন কাজ করে:
- ফ্লাইওয়েট প্যাটার্ন সাধারণ অবজেক্টের জন্য একটি কেন্দ্রীয় ক্লাস তৈরি করে।
- এই ক্লাসটি সাধারণ বৈশিষ্ট্যগুলো সংরক্ষণ করে, যেমন গাছের রঙ বা চরিত্রের প্রকার।
- ভিন্ন ভিন্ন বৈশিষ্ট্যগুলো, যেমন গাছের অবস্থান বা চরিত্রের নাম, আলাদাভাবে সংরক্ষণ করা হয়।
- ফলে, একই ধরনের গাছ বা চরিত্রের জন্য নতুন অবজেক্ট তৈরি না করে, মেমরি দক্ষতার সাথে ব্যবহার করা সম্ভব হয়।

## সংক্ষেপে
ফ্লাইওয়েট প্যাটার্ন ব্যবহার করে, আপনি গেমের পারফরম্যান্স উন্নত করতে পারেন এবং মেমরি ব্যবহারে সাশ্রয় করতে পারেন। এটি একই ধরনের অবজেক্টগুলোর মধ্যে সাধারণ অংশগুলো শেয়ার করার মাধ্যমে আপনার গেমের দক্ষতা বাড়ায়।
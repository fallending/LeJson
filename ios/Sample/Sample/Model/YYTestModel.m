// Generated by LeJson ,  DO NOT EDIT!
// Feedback to https://github.com/iwanglian/LeJson/issues,  DO NOT EDIT!

// Created by alick on 2016-06-01 16:41:33,  DO NOT EDIT!

#import "YYTestModel.h"

@implementation YYTestModel


-(instancetype)init{
    self = [super init];
    if (self) {
        self.stories = [[NSMutableArray alloc] init];
        self.top_stories = [[NSMutableArray alloc] init];

    }
    return self;
}
    
+ (NSDictionary *)modelContainerPropertyGenericClass{
   return @{
        @"stories" : @"YYTestModel_Stories",
        @"top_stories" : @"YYTestModel_TopStories",

    };
}


+ (NSDictionary *)modelCustomPropertyMapper{
   return @{

    };
}
@end


@implementation YYTestModel_Stories


-(instancetype)init{
    self = [super init];
    if (self) {
        self.images = [[NSMutableArray alloc] init];

    }
    return self;
}
    
+ (NSDictionary *)modelContainerPropertyGenericClass{
   return @{
        @"images" : @"NSString",

    };
}


+ (NSDictionary *)modelCustomPropertyMapper{
   return @{
        @"ID" : @"id",

    };
}
@end


@implementation YYTestModel_TopStories


-(instancetype)init{
    self = [super init];
    if (self) {

    }
    return self;
}
    
+ (NSDictionary *)modelContainerPropertyGenericClass{
   return @{

    };
}


+ (NSDictionary *)modelCustomPropertyMapper{
   return @{
        @"ID" : @"id",

    };
}
@end



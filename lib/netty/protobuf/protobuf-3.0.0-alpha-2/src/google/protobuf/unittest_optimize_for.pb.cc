// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_optimize_for.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "google/protobuf/unittest_optimize_for.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace protobuf_unittest {

namespace {

const ::google::protobuf::Descriptor* TestOptimizedForSize_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  TestOptimizedForSize_reflection_ = NULL;
struct TestOptimizedForSizeOneofInstance {
  ::google::protobuf::int32 integer_field_;
  ::google::protobuf::internal::ArenaStringPtr string_field_;
}* TestOptimizedForSize_default_oneof_instance_ = NULL;
const ::google::protobuf::Descriptor* TestRequiredOptimizedForSize_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  TestRequiredOptimizedForSize_reflection_ = NULL;
const ::google::protobuf::Descriptor* TestOptionalOptimizedForSize_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  TestOptionalOptimizedForSize_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto() {
  protobuf_AddDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "google/protobuf/unittest_optimize_for.proto");
  GOOGLE_CHECK(file != NULL);
  TestOptimizedForSize_descriptor_ = file->message_type(0);
  static const int TestOptimizedForSize_offsets_[5] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, i_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, msg_),
    PROTO2_GENERATED_DEFAULT_ONEOF_FIELD_OFFSET(TestOptimizedForSize_default_oneof_instance_, integer_field_),
    PROTO2_GENERATED_DEFAULT_ONEOF_FIELD_OFFSET(TestOptimizedForSize_default_oneof_instance_, string_field_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, foo_),
  };
  TestOptimizedForSize_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      TestOptimizedForSize_descriptor_,
      TestOptimizedForSize::default_instance_,
      TestOptimizedForSize_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, _has_bits_[0]),
      -1,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, _extensions_),
      TestOptimizedForSize_default_oneof_instance_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, _oneof_case_[0]),
      sizeof(TestOptimizedForSize),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptimizedForSize, _internal_metadata_),
      -1);
  TestRequiredOptimizedForSize_descriptor_ = file->message_type(1);
  static const int TestRequiredOptimizedForSize_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestRequiredOptimizedForSize, x_),
  };
  TestRequiredOptimizedForSize_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      TestRequiredOptimizedForSize_descriptor_,
      TestRequiredOptimizedForSize::default_instance_,
      TestRequiredOptimizedForSize_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestRequiredOptimizedForSize, _has_bits_[0]),
      -1,
      -1,
      sizeof(TestRequiredOptimizedForSize),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestRequiredOptimizedForSize, _internal_metadata_),
      -1);
  TestOptionalOptimizedForSize_descriptor_ = file->message_type(2);
  static const int TestOptionalOptimizedForSize_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptionalOptimizedForSize, o_),
  };
  TestOptionalOptimizedForSize_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      TestOptionalOptimizedForSize_descriptor_,
      TestOptionalOptimizedForSize::default_instance_,
      TestOptionalOptimizedForSize_offsets_,
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptionalOptimizedForSize, _has_bits_[0]),
      -1,
      -1,
      sizeof(TestOptionalOptimizedForSize),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TestOptionalOptimizedForSize, _internal_metadata_),
      -1);
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
inline void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      TestOptimizedForSize_descriptor_, &TestOptimizedForSize::default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      TestRequiredOptimizedForSize_descriptor_, &TestRequiredOptimizedForSize::default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      TestOptionalOptimizedForSize_descriptor_, &TestOptionalOptimizedForSize::default_instance());
}

}  // namespace

void protobuf_ShutdownFile_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto() {
  delete TestOptimizedForSize::default_instance_;
  delete TestOptimizedForSize_default_oneof_instance_;
  delete TestOptimizedForSize_reflection_;
  delete TestRequiredOptimizedForSize::default_instance_;
  delete TestRequiredOptimizedForSize_reflection_;
  delete TestOptionalOptimizedForSize::default_instance_;
  delete TestOptionalOptimizedForSize_reflection_;
}

void protobuf_AddDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::protobuf_unittest::protobuf_AddDesc_google_2fprotobuf_2funittest_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n+google/protobuf/unittest_optimize_for."
    "proto\022\021protobuf_unittest\032\036google/protobu"
    "f/unittest.proto\"\312\002\n\024TestOptimizedForSiz"
    "e\022\t\n\001i\030\001 \001(\005\022.\n\003msg\030\023 \001(\0132!.protobuf_uni"
    "ttest.ForeignMessage\022\027\n\rinteger_field\030\002 "
    "\001(\005H\000\022\026\n\014string_field\030\003 \001(\tH\000*\t\010\350\007\020\200\200\200\200\002"
    "2@\n\016test_extension\022\'.protobuf_unittest.T"
    "estOptimizedForSize\030\322\t \001(\0052r\n\017test_exten"
    "sion2\022\'.protobuf_unittest.TestOptimizedF"
    "orSize\030\323\t \001(\0132/.protobuf_unittest.TestRe"
    "quiredOptimizedForSizeB\005\n\003foo\")\n\034TestReq"
    "uiredOptimizedForSize\022\t\n\001x\030\001 \002(\005\"Z\n\034Test"
    "OptionalOptimizedForSize\022:\n\001o\030\001 \001(\0132/.pr"
    "otobuf_unittest.TestRequiredOptimizedFor"
    "SizeB\002H\002", 568);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "google/protobuf/unittest_optimize_for.proto", &protobuf_RegisterTypes);
  TestOptimizedForSize::default_instance_ = new TestOptimizedForSize();
  TestOptimizedForSize_default_oneof_instance_ = new TestOptimizedForSizeOneofInstance();
  TestRequiredOptimizedForSize::default_instance_ = new TestRequiredOptimizedForSize();
  TestOptionalOptimizedForSize::default_instance_ = new TestOptionalOptimizedForSize();
  TestOptimizedForSize::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::ExtensionSet::RegisterExtension(
    &::protobuf_unittest::TestOptimizedForSize::default_instance(),
    1234, 5, false, false);
  ::google::protobuf::internal::ExtensionSet::RegisterMessageExtension(
    &::protobuf_unittest::TestOptimizedForSize::default_instance(),
    1235, 11, false, false,
    &::protobuf_unittest::TestRequiredOptimizedForSize::default_instance());
  TestRequiredOptimizedForSize::default_instance_->InitAsDefaultInstance();
  TestOptionalOptimizedForSize::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto {
  StaticDescriptorInitializer_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto() {
    protobuf_AddDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto();
  }
} static_descriptor_initializer_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto_;

// ===================================================================

#ifndef _MSC_VER
const int TestOptimizedForSize::kIFieldNumber;
const int TestOptimizedForSize::kMsgFieldNumber;
const int TestOptimizedForSize::kIntegerFieldFieldNumber;
const int TestOptimizedForSize::kStringFieldFieldNumber;
#endif  // !_MSC_VER

#ifndef _MSC_VER
const int TestOptimizedForSize::kTestExtensionFieldNumber;
#endif
::google::protobuf::internal::ExtensionIdentifier< ::protobuf_unittest::TestOptimizedForSize,
    ::google::protobuf::internal::PrimitiveTypeTraits< ::google::protobuf::int32 >, 5, false >
  TestOptimizedForSize::test_extension(kTestExtensionFieldNumber, 0);
#ifndef _MSC_VER
const int TestOptimizedForSize::kTestExtension2FieldNumber;
#endif
::google::protobuf::internal::ExtensionIdentifier< ::protobuf_unittest::TestOptimizedForSize,
    ::google::protobuf::internal::MessageTypeTraits< ::protobuf_unittest::TestRequiredOptimizedForSize >, 11, false >
  TestOptimizedForSize::test_extension2(kTestExtension2FieldNumber, ::protobuf_unittest::TestRequiredOptimizedForSize::default_instance());
TestOptimizedForSize::TestOptimizedForSize()
  : ::google::protobuf::Message() , _internal_metadata_(NULL)  {
  SharedCtor();
  // @@protoc_insertion_point(constructor:protobuf_unittest.TestOptimizedForSize)
}

void TestOptimizedForSize::InitAsDefaultInstance() {
  msg_ = const_cast< ::protobuf_unittest::ForeignMessage*>(&::protobuf_unittest::ForeignMessage::default_instance());
  TestOptimizedForSize_default_oneof_instance_->integer_field_ = 0;
  TestOptimizedForSize_default_oneof_instance_->string_field_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

TestOptimizedForSize::TestOptimizedForSize(const TestOptimizedForSize& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:protobuf_unittest.TestOptimizedForSize)
}

void TestOptimizedForSize::SharedCtor() {
  ::google::protobuf::internal::GetEmptyString();
  _cached_size_ = 0;
  i_ = 0;
  msg_ = NULL;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  clear_has_foo();
}

TestOptimizedForSize::~TestOptimizedForSize() {
  // @@protoc_insertion_point(destructor:protobuf_unittest.TestOptimizedForSize)
  SharedDtor();
}

void TestOptimizedForSize::SharedDtor() {
  if (has_foo()) {
    clear_foo();
  }
  if (this != default_instance_) {
    delete msg_;
  }
}

void TestOptimizedForSize::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* TestOptimizedForSize::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return TestOptimizedForSize_descriptor_;
}

const TestOptimizedForSize& TestOptimizedForSize::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto();
  return *default_instance_;
}

TestOptimizedForSize* TestOptimizedForSize::default_instance_ = NULL;

TestOptimizedForSize* TestOptimizedForSize::New(::google::protobuf::Arena* arena) const {
  TestOptimizedForSize* n = new TestOptimizedForSize;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void TestOptimizedForSize::clear_foo() {
  switch(foo_case()) {
    case kIntegerField: {
      // No need to clear
      break;
    }
    case kStringField: {
      foo_.string_field_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
      break;
    }
    case FOO_NOT_SET: {
      break;
    }
  }
  _oneof_case_[0] = FOO_NOT_SET;
}


void TestOptimizedForSize::Swap(TestOptimizedForSize* other) {
  if (other == this) return;
  InternalSwap(other);
}
void TestOptimizedForSize::InternalSwap(TestOptimizedForSize* other) {
  GetReflection()->Swap(this, other);}

::google::protobuf::Metadata TestOptimizedForSize::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = TestOptimizedForSize_descriptor_;
  metadata.reflection = TestOptimizedForSize_reflection_;
  return metadata;
}


// ===================================================================

#ifndef _MSC_VER
const int TestRequiredOptimizedForSize::kXFieldNumber;
#endif  // !_MSC_VER

TestRequiredOptimizedForSize::TestRequiredOptimizedForSize()
  : ::google::protobuf::Message() , _internal_metadata_(NULL)  {
  SharedCtor();
  // @@protoc_insertion_point(constructor:protobuf_unittest.TestRequiredOptimizedForSize)
}

void TestRequiredOptimizedForSize::InitAsDefaultInstance() {
}

TestRequiredOptimizedForSize::TestRequiredOptimizedForSize(const TestRequiredOptimizedForSize& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:protobuf_unittest.TestRequiredOptimizedForSize)
}

void TestRequiredOptimizedForSize::SharedCtor() {
  _cached_size_ = 0;
  x_ = 0;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

TestRequiredOptimizedForSize::~TestRequiredOptimizedForSize() {
  // @@protoc_insertion_point(destructor:protobuf_unittest.TestRequiredOptimizedForSize)
  SharedDtor();
}

void TestRequiredOptimizedForSize::SharedDtor() {
  if (this != default_instance_) {
  }
}

void TestRequiredOptimizedForSize::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* TestRequiredOptimizedForSize::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return TestRequiredOptimizedForSize_descriptor_;
}

const TestRequiredOptimizedForSize& TestRequiredOptimizedForSize::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto();
  return *default_instance_;
}

TestRequiredOptimizedForSize* TestRequiredOptimizedForSize::default_instance_ = NULL;

TestRequiredOptimizedForSize* TestRequiredOptimizedForSize::New(::google::protobuf::Arena* arena) const {
  TestRequiredOptimizedForSize* n = new TestRequiredOptimizedForSize;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void TestRequiredOptimizedForSize::Swap(TestRequiredOptimizedForSize* other) {
  if (other == this) return;
  InternalSwap(other);
}
void TestRequiredOptimizedForSize::InternalSwap(TestRequiredOptimizedForSize* other) {
  GetReflection()->Swap(this, other);}

::google::protobuf::Metadata TestRequiredOptimizedForSize::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = TestRequiredOptimizedForSize_descriptor_;
  metadata.reflection = TestRequiredOptimizedForSize_reflection_;
  return metadata;
}


// ===================================================================

#ifndef _MSC_VER
const int TestOptionalOptimizedForSize::kOFieldNumber;
#endif  // !_MSC_VER

TestOptionalOptimizedForSize::TestOptionalOptimizedForSize()
  : ::google::protobuf::Message() , _internal_metadata_(NULL)  {
  SharedCtor();
  // @@protoc_insertion_point(constructor:protobuf_unittest.TestOptionalOptimizedForSize)
}

void TestOptionalOptimizedForSize::InitAsDefaultInstance() {
  o_ = const_cast< ::protobuf_unittest::TestRequiredOptimizedForSize*>(&::protobuf_unittest::TestRequiredOptimizedForSize::default_instance());
}

TestOptionalOptimizedForSize::TestOptionalOptimizedForSize(const TestOptionalOptimizedForSize& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:protobuf_unittest.TestOptionalOptimizedForSize)
}

void TestOptionalOptimizedForSize::SharedCtor() {
  _cached_size_ = 0;
  o_ = NULL;
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

TestOptionalOptimizedForSize::~TestOptionalOptimizedForSize() {
  // @@protoc_insertion_point(destructor:protobuf_unittest.TestOptionalOptimizedForSize)
  SharedDtor();
}

void TestOptionalOptimizedForSize::SharedDtor() {
  if (this != default_instance_) {
    delete o_;
  }
}

void TestOptionalOptimizedForSize::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* TestOptionalOptimizedForSize::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return TestOptionalOptimizedForSize_descriptor_;
}

const TestOptionalOptimizedForSize& TestOptionalOptimizedForSize::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_google_2fprotobuf_2funittest_5foptimize_5ffor_2eproto();
  return *default_instance_;
}

TestOptionalOptimizedForSize* TestOptionalOptimizedForSize::default_instance_ = NULL;

TestOptionalOptimizedForSize* TestOptionalOptimizedForSize::New(::google::protobuf::Arena* arena) const {
  TestOptionalOptimizedForSize* n = new TestOptionalOptimizedForSize;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void TestOptionalOptimizedForSize::Swap(TestOptionalOptimizedForSize* other) {
  if (other == this) return;
  InternalSwap(other);
}
void TestOptionalOptimizedForSize::InternalSwap(TestOptionalOptimizedForSize* other) {
  GetReflection()->Swap(this, other);}

::google::protobuf::Metadata TestOptionalOptimizedForSize::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = TestOptionalOptimizedForSize_descriptor_;
  metadata.reflection = TestOptionalOptimizedForSize_reflection_;
  return metadata;
}


// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf_unittest

// @@protoc_insertion_point(global_scope)
